/**
 * Represents a student.
 * We change this from a 'data class' to a regular 'class'
 * because we are adding custom logic (like the setter)
 * and changing how properties are initialized.
 */
class Student(
    val id: String,
    val name: String,
    val course: String
) {
    /**
     * The student's mark, initialized to 0.
     * It has a custom 'set' block for validation.
     */
    var mark: Double = 0.0
        set(value) {
            // Validate the mark is between 0 and 100
            if (value >= 0 && value <= 100) {
                field = value // 'field' is a special keyword for the property's backing field
            } else {
                println("Error: Mark must be between 0 and 100. Mark not updated.")
            }
        }

    /**
     * Returns the student's grade as a String
     * based on their mark.
     */
    fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    /**
     * Returns true if the student passed,
     * false if they failed.
     */
    fun didPass(): Boolean {
        return mark >= 40 // Pass mark is 40
    }

    /**
     * Returns the details of the student.
     */
    override fun toString(): String {
        return "Name: $name, Course: $course, Mark: $mark"
    }
}