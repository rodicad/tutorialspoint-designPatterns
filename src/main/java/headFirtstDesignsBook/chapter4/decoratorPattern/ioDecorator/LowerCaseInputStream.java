package main.java.headFirtstDesignsBook.chapter4.decoratorPattern.ioDecorator;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * Created by rodicad on 17/08/2017.
 */
public class LowerCaseInputStream extends FilterInputStream {
     InputStream fileInputStream;

    public LowerCaseInputStream(InputStream fileInputStream) {
        super(fileInputStream);
    }




}
