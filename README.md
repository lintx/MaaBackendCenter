# MaaBackendCenter

使用 Java 重写的 MAA 作业服务器后端

## 开发技术栈

- Java 17
- SpringBoot 3.0.0
    - spring-security
    - springdoc-openapi
- MongoDB
- Redis

## 开发注意事项

配置文件默认启用的`dev`配置文件，该文件不存在于仓库内，仅提供模板文件`application-template.yml`
，请手动创建`application-dev.yml`，并按照自己的配置进行修改

## 项目结构

- config 存放spring配置
- controller 交互层
  - request 入参类型
  - response 相应类型
- repository 数据仓库层，用于和数据库交互
  - entity 与数据库字段对应的类型
- service 业务处理层，复杂或者公用逻辑放在这里（注：您无需为每个类型都提供对应接口，只有当接口在可见未来有多个实现的时候才考虑建立接口）
  - model 应用内传输用类型放这里
- utils 工具类

## native 编译

1. 安装 [GraalVM](https://github.com/graalvm/graalvm-ce-builds/releases) Java17，并配置好环境变量，部分功能需要正确配置 `JAVA_HOME` 变量为 GraalVM 安装目录才能正常使用
2. 如果您处于 Windows 环境下，需要安装 `Visual Studio` 并且安装 C++ 组件，Linux 环境下则需要安装 `gcc` 工具链，Mac 下需要安装 `xcode` 工具链，详情查看 [native-image#prerequisites](https://www.graalvm.org/22.3/reference-manual/native-image/#prerequisites)
3. 通过 `gu install native-image` 安装 `native-image` AOT 编译器
4. 在该项目目录下，执行 `./gradlew nativeRun` 或者 `.\gradlew.bat nativeRun` 编译并运行该项目
5. 如果您希望产生 docker image，请执行 `./gradlew bootBuildImage`

## Join us!

QQ Group: 724540644
