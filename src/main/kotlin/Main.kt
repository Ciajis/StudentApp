data class Student(
    val id: String,
    val name: String,
    val course: String,
    val mark: Double
) {

    override fun toString(): String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
}


fun main() {
    // Create an instance of the Student class...
    val student1 = Student(
        id = "s12345",
        name = "Jane Doe",
        course = "Computing Science",
        mark = 88.5
    )

    // Create a second student
    val student2 = Student(
        id = "s67890",
        name = "John Smith",
        course = "Data Analytics",
        mark = 76.0
    )

    // Print the student details.
    println(student1)
    println(student2)
}