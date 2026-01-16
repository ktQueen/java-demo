package com.imooc.pt.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtils {
    public static void main(String[] args) {
        ShapeUtils utils = new ShapeUtils();
        List<Circle> circleList = new ArrayList<>();
        utils.drawAll(circleList);
        List<Shape> list = new ArrayList<>();
        utils.doSth(list);
    }

    //    传入的底线在哪儿
    public void doSth(List<? super Retangle> shapeList) {
        System.out.println("");
    }

    //    传入的上线在哪儿
    public void drawAll(List<? extends Shape> shapeList) {
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
