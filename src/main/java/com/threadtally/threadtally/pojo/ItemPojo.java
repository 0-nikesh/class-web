package com.threadtally.threadtally.pojo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPojo {

    private Integer id;


    @NotEmpty(message = "fill everything")
    private String itemName;


    @NotNull
    private  Integer itemQuantity;

    @NotNull
    private Double itemPrice;

}
