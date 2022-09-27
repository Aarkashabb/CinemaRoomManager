fun convertStringToDouble(input: String): Double {
    try {
        return input.toDouble()
    } catch (e: NumberFormatException) {
        return 0.0
    }
}

