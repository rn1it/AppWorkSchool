package com.rn1.week1

open class Human (var name:String) :Character{

    var mana: Int = 0

    open fun attack(){
        println("$name use First Attack!")
    }

    override fun checkMana(mana: Int) :Boolean{
        return mana > 0
    }
}

class Mage(name: String) : Human (name){
    override fun attack() {
        println("$name use Fireball!")
    }
}

interface Character{
   fun checkMana(mana:Int) :Boolean
}

fun main() {
    println("characterA:")
    val hero = Human("Peter")
    hero.attack()
    var manaOrNot = hero.checkMana(hero.mana)
    println("manaOrNot: $manaOrNot(MP:${hero.mana})")

    println("------------------- \ncharacterB:")
    val superman = Mage("Justin")
    superman.attack()
    superman.mana = 200
    manaOrNot = superman.checkMana(superman.mana)
    println("manaOrNot: $manaOrNot (MP:${superman.mana})")

}