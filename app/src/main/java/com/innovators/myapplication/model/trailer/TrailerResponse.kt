package com.innovators.myapplication.model.trailer

import com.google.gson.annotations.SerializedName

data class TrailerResponse(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("results")
	val results: List<TrailerItem>? = null
)