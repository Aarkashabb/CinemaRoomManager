

fun printFifthCharacter(input: String): String {
    return try {
        "The fifth character of the entered word is ${input[4]}"
    } catch (e:StringIndexOutOfBoundsException ){
       return "The input word is too short!"
    }

}

