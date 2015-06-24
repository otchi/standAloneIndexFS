package com.edifixio.JsonFastBuild;

import com.google.gson.JsonObject;

public interface JsonBuilderBeginEnd<OriginalType,ParentType>  {
	
	/*public K putArray();
	
	public K putArray(JsonArray jsonArray);*/
	
	public OriginalType putObject();
	
	public OriginalType putObject(JsonObject jsonObject);
	
	public JsonBuilderBeginEnd<OriginalType,ParentType> end();
	
	/*
	public K endAndReturn();
	
	
	/*public JsonBuilderBeginEnd<T>  putArrayAndStop();
	
	public JsonBuilderBeginEnd<T>  putArrayAndStop(JsonArray jsonArray);
	
	public JsonBuilderBeginEnd<T>  putObjectAndStop();
	
	public JsonBuilderBeginEnd<T>  putObjectAndStop(JsonArray jsonArray);*/
	

}
