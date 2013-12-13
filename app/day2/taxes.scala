package day2

trait Rounding{
  def up(x: Double) = x.ceil
  def down(x: Double) = x.floor
}

class Book(isbnNumber: String, title: String, basePrice: Double, isImported: Boolean = false)



class Tax{
  def taxRate: Double = ???
  def compute: Double = ???

}

class SalesTax extends Tax

class ImportDuty extends Tax




