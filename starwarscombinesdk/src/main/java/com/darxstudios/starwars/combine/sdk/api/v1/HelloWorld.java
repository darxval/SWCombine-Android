package com.darxstudios.starwars.combine.sdk.api.v1;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class HelloWorld {

    @Element(name = "message")
    private String message;

    @Attribute(name = "version")
    private String version;


    @Attribute(name="timestamp-swc")
    private String timestampSwc;

    public String getMessage() {
        return message;
    }


    public String getVersion() {
        return version;
    }



    public String getTimestampSwc() {
        return timestampSwc;
    }
}
