package com.rakuten.StudentApp.Controller;

import com.rakuten.StudentApp.Model.FRCTDetail;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/FRCTDetail")
@Api(tags = { "IFRCTDetailController" })

@SwaggerDefinition(tags = { @Tag(name = "IFRCTDetailController", description = "Controller APIs related to FRCTDetailController Controller") })
public interface IFRCTDetailController {
    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Create FRCTDetail", response = FRCTDetail.class, authorizations = { @Authorization(value = "default", scopes = {
            @AuthorizationScope(scope = "Role_API_FRCTDetail_create", description = "create") }) }, tags = "Create FRCTDetail")
    FRCTDetail create(@ApiParam(value = "FRCTDetail object for create", name = "FRCTDetail", required = false) @RequestBody(required = false) FRCTDetail frctDetail);

}
