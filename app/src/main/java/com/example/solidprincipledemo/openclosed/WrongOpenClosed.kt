package com.example.solidprincipledemo.openclosed

data class Rectangle(
    var length: Double,
    var height: Double
)


data class Circle(var radius: Double)

data class Triangle(var length1: Double, val length2: Double, val len3: Double)

class AreaFactory {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area: Double = 0.0;
        for (shape in shapes) {
            if (shape is Rectangle) {
                area += (shape.length * shape.height);
            } else if (shape is Circle) {
                area += (shape.radius * shape.radius * Math.PI);
            } else {
                throw RuntimeException("Shape not supported")
            }
        }
        return area;
    }
}
