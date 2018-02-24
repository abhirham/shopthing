package com.example.abhirham.shopthing.services

import com.example.abhirham.shopthing.model.Product
import com.example.abhirham.shopthing.model.category

/**
 * Created by Abhirham on 2018-02-23.
 */
object dataservice {
    val categories = listOf(
            category("Shirts", "shirtimage"),
            category("hoodies","hoodieimage"),
            category("hats","hatimage"),
            category("digital", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("beanie","$18","hat1"),
            Product("black hat","$20","hat2"),
            Product("white hat","$18","hat3"),
            Product("snapback","$22","hat4")
    )

    val hoodies = listOf(
            Product("gery hoodie","$28","hoodie1"),
            Product("red hoodie","$32","hoodie2"),
            Product("white hoodie","$28","hoodie3"),
            Product("black hoodie","$28","hoodie4")
            )

    val shirts = listOf(
            Product("black shirt","$28","shirt1"),
            Product("red shirt","$32","shirt2"),
            Product("white shirt","$18","shirt3"),
            Product("purple shirt","$25","shirt4"),
            Product("pink shirt","$48","shirt5")
    )
}