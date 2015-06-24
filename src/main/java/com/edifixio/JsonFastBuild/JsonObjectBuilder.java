package com.edifixio.JsonFastBuild;

import com.google.gson.JsonObject;

public class JsonObjectBuilder<ParentType> implements JsonBuilderBeginEnd<JsonObjectBuilder<ParentType>,ParentType>,IBeginObject<JsonObjectBuilder<ParentType>,ParentType>{
	
	private JsonObject jsonObject;
	private ParentType parent=null;
	private String lastProperty;

	@SuppressWarnings("unchecked")
	private JsonObjectBuilder(){
		this.jsonObject=new JsonObject();
		parent=(ParentType) this;
	}
	
	private JsonObjectBuilder(ParentType parent){
		this.parent=parent;
		this.jsonObject=new JsonObject();
	}

	@SuppressWarnings("unchecked")
	public JsonObjectBuilder<ParentType> putObject() {
		// TODO Auto-generated method stub
		JsonObjectBuilder<JsonObjectBuilder<ParentType>> job=new JsonObjectBuilder<JsonObjectBuilder<ParentType>>(this);
		this.jsonObject.add(lastProperty, job.getJsonObject());
		return (JsonObjectBuilder<ParentType>) job;
	}



	public JsonObjectBuilder<ParentType> putObject(JsonObject jsonObject) {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonBuilderBeginEnd<JsonObjectBuilder<ParentType>,ParentType> begin() {
		// TODO Auto-generated method stub
		return this;
	}

	public ParentType EmptyObject() {
		// TODO Auto-generated method stub
		return parent;
	}

	@SuppressWarnings("unchecked")
	public JsonBuilderBeginEnd<JsonObjectBuilder<ParentType>,ParentType> end() {
		// TODO Auto-generated method stub
		return (JsonBuilderBeginEnd<JsonObjectBuilder<ParentType>, ParentType>) parent;
	}


	public JsonObject getJsonObject() {
		return jsonObject;
	}
	
	public static class InitJsonObject{
		
		@SuppressWarnings("rawtypes")
		public static  JsonObjectBuilder<JsonObjectBuilder>  Init(){
			return new JsonObjectBuilder<JsonObjectBuilder>(); 
		}
	}

	/*
	public JsonBuilderBeginEnd<JsonObjectBuilder<T>> begin(){
		return this;
	}
	
	public JsonBuilderBeginEnd<JsonObjectBuilder<T>> get(){
		return this.begin();
	}

	public JsonObjectBuilder<T> endAndReturn() {
		// TODO Auto-generated method stub
		return this;
	}

	*/
	public static void main(String args[]){
		;
		System.out.println();
	
	}/*

	public JsonObjectBuilder<T> putArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonObjectBuilder<T> putArray(JsonArray jsonArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonObjectBuilder<T> putObject() {
		// TODO Auto-generated method stub
		return null;
	}

	public JsonObjectBuilder<T> putObject(JsonArray jsonArray) {
		// TODO Auto-generated method stub
		return null;
	}*/





}
