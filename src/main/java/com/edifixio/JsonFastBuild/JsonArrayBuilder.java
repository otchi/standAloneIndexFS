package com.edifixio.JsonFastBuild;

import com.edifixio.JsonFastBuild.JsonObjectBuilder.InitJsonObject;
import com.google.gson.JsonArray;

public class JsonArrayBuilder {
	
	 private JsonArray jsonArray;

	
	 public JsonArrayBuilder() {
		// TODO Auto-generated constructor stub
		 this.jsonArray=new JsonArray();
	}
	 
	 public JsonArrayBuilder(JsonArray jsonArray) {
		// TODO Auto-generated constructor stub
		 this.jsonArray=jsonArray;
	}
	

	
	public JsonArray getJsonArray() {
		return jsonArray;
	}


	public static void main(String args[]){
		
		System.out.println(InitJsonObject.Init().begin().end());
	
	}
}
