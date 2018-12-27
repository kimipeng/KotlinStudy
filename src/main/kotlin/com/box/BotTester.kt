package com.box.kotlin


fun main(args: Array<String>) {

    var box3 = Box3()
    var box5 = Box5()

    val strings = arrayOf("length", "width", "height")
    val boxInfo = HashMap<String, Float>()

    // 練習kotlin strings 方法，並用readLine讀取輸入值
    strings.forEach {
        print("Please enter object's $it:")
        boxInfo.put(it, readLine()!!.toFloat())
    }

    // 先判定Box5是否裝得下，再判定Box3。
    if (box5.validate(boxInfo)) {
        if (box3.validate(boxInfo)) {
            box3.printMatchSize()
        } else {
            box5.printMatchSize()
        }
    } else {
        println("Box3 & Box5 dose not match.")
    }

}

/* Kotlin版本: 物件利用多型新增 validate 傳入HashMap */
abstract class Box(open var length: Float, open var width: Float, open var height: Float) {

    fun validate(boxInfo: Map<String, Float>): Boolean {
        return validate(boxInfo.get("lenght")!!, boxInfo.get("width")!!, boxInfo.get("height")!!)
    }

    abstract fun validate(length: Float, width: Float, height: Float): Boolean

    abstract fun printMatchSize()
}


class Box3 : Box(23f, 14f, 13f) {

    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return (this.length > length) && (this.width > width) && (this.height > height)
    }

    // 練習如何像Java列印出 Box3.class.getSimpleName();
    // Kotlin: Box3::class.java.simpleName
    override fun printMatchSize() = println(Box3::class.java.simpleName)
}


class Box5 : Box(39.5f, 27.5f, 23f) {

    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return (this.length > length) && (this.width > width) && (this.height > height)
    }

    override fun printMatchSize() = println(Box5::class.java.simpleName)
}