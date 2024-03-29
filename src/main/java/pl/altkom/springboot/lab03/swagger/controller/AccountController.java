package pl.altkom.springboot.lab03.swagger.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab03.swagger.controller.model.Account;
import pl.altkom.springboot.lab03.swagger.controller.model.CreateAccountRequest;
import pl.altkom.springboot.lab03.swagger.controller.model.UpdateAccountRequest;

@Tag(name = "Account Management Resource")
@RequiredArgsConstructor
@RequestMapping("/account")
@RestController
public class AccountController {

    @Operation(summary = "Get all accounts", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @GetMapping
    public List<Account> getAccounts() {
        return List.of();
    }

    @Operation(summary = "Get account by id", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable("id") final Long accountId) {
        return Account.builder().build();
    }

    @Operation(summary = "Create account", responses = {
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Long createAccount(@RequestBody final CreateAccountRequest request) {
        return null;
    }

    @Operation(summary = "Update account", responses = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request")
    })
    @PutMapping("/{id}")
    public void updateAccount(@PathVariable("id") final Long accountId, @RequestBody final UpdateAccountRequest request) {

    }

    @Operation(summary = "Upload avatar image")
    @PostMapping(value = "/{id}/avatar", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void upload(@PathVariable("id") final Long accountId, @RequestParam final MultipartFile multipartFile) {

    }
}
