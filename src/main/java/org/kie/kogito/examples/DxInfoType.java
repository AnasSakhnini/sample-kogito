package org.kie.kogito.examples;

public enum DxInfoType {
    POA,YearOfOnset;
    public String value(){
        return name();
    }
    public static DxInfoType fromValue(String v){
        return valueOf(v);
    }
}
