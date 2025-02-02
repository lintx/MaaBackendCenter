package plus.maa.backend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.maa.backend.controller.response.MaaResult;
import plus.maa.backend.controller.response.MaaSystemInfo;

/**
 * @author AnselYuki
 */
@Setter
@Tag(name = "System")
@RequestMapping("")
@RestController
@RequiredArgsConstructor
public class SystemController {
    private final MaaSystemInfo systemInfo;

    @GetMapping("/")
    @Operation(summary = "Tests if the server is ready.")
    public MaaResult<String> test() {
        return MaaResult.success("Maa Copilot Server is Running", null);
    }

    @GetMapping("version")
    @Operation(summary = "Gets the current version of the server.")
    public MaaResult<MaaSystemInfo> getSystemVersion() {
        return MaaResult.success(systemInfo);
    }
}
