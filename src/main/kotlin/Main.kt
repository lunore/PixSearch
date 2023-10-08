fun main(args: Array<String>) {
/*   val input = readln()
   var output = ""
   output = when(input.lowercase()) {
      "opona" -> "Felga"
      "maska" -> "Szyba"
      "test", "cv", "elektronika" -> "COŚ"
      else -> "Błąd"
   }
   println(output)*/


   println("Wpisz liczbe: ")
   var number: Int
   try {
      number = readln().toInt()
   } catch (e: NumberFormatException) {
      println("To nie jest liczba")
      return
   } catch (e: IllegalAccessException) {

   } finally {
       
   }

   var output = ""
   output = when {
      number > 0 -> "Liczba większa od 0"
      number == 0 -> "Liczba równa 0"
      else -> "Liczba mniejsza od 0"
   }
   println(output)
}