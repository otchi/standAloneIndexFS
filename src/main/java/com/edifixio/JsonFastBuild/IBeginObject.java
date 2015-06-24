package com.edifixio.JsonFastBuild;

public interface IBeginObject<OriginalType,ParentType> {
	public JsonBuilderBeginEnd<OriginalType,ParentType>  begin();
	public ParentType EmptyObject();
	
	

}
