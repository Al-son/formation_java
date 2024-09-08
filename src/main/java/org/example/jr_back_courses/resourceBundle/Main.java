package org.example.jr_back_courses.resourceBundle;

import java.io.IOException;
import java.util.*;

public class Main extends ResourceBundle.Control {
    @Override
    public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
        return super.newBundle(baseName, locale, format, loader, reload);
    }

    public static void main(String[] args) {
//        Locale locale = new Locale("es", "Fr");
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);
//        System.out.println(resourceBundle.getString("farewell"));
//
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "En"));
            System.out.println(bundle.getString("Bonjour"));
        } catch (MissingResourceException e) {
            System.out.println("Message par default: Hello");
        }

//        Enumeration<String> keys = bundle.getKeys();
//       while (keys.hasMoreElements()){
//           System.out.println(keys.nextElement());
//       }

//
//        String[] myArrays = bundle.getString("my_array").split(",");
//        System.out.println(Arrays.toString(myArrays));
    }
}
