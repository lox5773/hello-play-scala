class Person(age: Int, isMale: Boolean = true){
  def isWise = if (isMale) age > 21 else age > 18
  def canMarry(drinkStrategy: Int => Boolean) =
    isWise && drinkStrategy(age)
}
val indiaDrinkStrategy = {value: Int => value > 30
}
new Person(40, true)
val p = new Person(40)
p.isWise
p.canMarry(indiaDrinkStrategy)
p.canMarry(x => x > 30)
p.canMarry(x => false)
p.canMarry(_ > 30)
p.canMarry(x => indiaDrinkStrategy(x))
p.canMarry(indiaDrinkStrategy)

def londonDrinkStrategy(age: Int) = age > 20
p.canMarry(_ > 20)
p.canMarry(x => londonDrinkStrategy(x))
p.canMarry(londonDrinkStrategy)

val manualEta1: Int => Boolean = londonDrinkStrategy
val manualEta2 = londonDrinkStrategy _  //partially applied function

p.canMarry(manualEta1)
p.canMarry(manualEta2)
