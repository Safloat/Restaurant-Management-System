package sample;

import java.net.URL;

public class FXMLFileLoader {

    public static URL loadResource(String resource)
    {
       return FXMLFileLoader.class.getClassLoader().getResource("sample/uiObjects/" + resource);
    }
}
