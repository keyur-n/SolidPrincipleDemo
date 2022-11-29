package com.example.solidprincipledemo.openclosed

interface Shape {
    val area: Double
}
// Rectangle.java

class RectangleCorrect : Shape {
    private val length = 0.0
    private val height = 0.0

    // getters/setters ...
    override val area: Double
        get() = length * height
}

// Circle.java
class CircleCorrect : Shape {
    private val radius = 0.0

    // getters/setters ...
    override val area: Double
        get() = radius * radius * Math.PI
}

// AreaFactory.java
class AreaFactoryCorrect {
    fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area = 0.0
        for (shape in shapes) {
            area += shape.area
        }
        return area
    }
}