fun main() {
    // 1. Create a student (mark is 0 by default)
    val student1 = Student(
        id = "s12345",
        name = "Jane Doe",
        course = "Computing Science"
    )

    println("Created student: $student1")

    // Prompt the user for the mark
    print("Please enter a mark for ${student1.name}: ")
    val inputMark = readlnOrNull()?.toDoubleOrNull() ?: -1.0 // Safely read a Double

    // Set the mark using the custom setter
    student1.mark = inputMark

    // Print the student's final status
    println("\n--- Student Status ---")
    println("Name: ${student1.name}")
    println("Mark: ${student1.mark}") // Access the mark property
    println("Grade: ${student1.getGrade()}") // Call the getGrade() method
    println("Passed: ${student1.didPass()}") // Call the didPass() method
}