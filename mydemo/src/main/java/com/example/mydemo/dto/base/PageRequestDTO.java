package com.example.mydemo.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class PageRequestDTO {
    @ApiModelProperty(value = "页码", dataType = "Integer", example = "1")
    @JsonProperty("page")
    private Integer page;

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @ApiModelProperty(value = "数量", dataType = "Integer", example = "20")
    @JsonProperty("limit")
    private Integer limit;

    public Integer getLimit() {
        return this.limit;
    }
}
