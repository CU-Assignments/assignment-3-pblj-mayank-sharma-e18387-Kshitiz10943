import java.util.HashMap;
import java.util.Map;

class UniversityEnrollmentSystem {
    private static final int COURSE_CAPACITY = 5;
    private static Map<String, Integer> courseEnrollments = new HashMap<>();
    private static Map<String, String> prerequisites = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        prerequisites.put("Advanced Java", "Core Java");
        courseEnrollments.put("Advanced Java", 4);
        
        try {
            System.out.print("Enroll in Course: ");
            String course = sc.nextLine();
            
            System.out.print("Prerequisite: ");
            String prerequisite = sc.nextLine();
            
            if (prerequisites.containsKey(course) && !prerequisites.get(course).equals(prerequisite)) {
                throw new Exception("Error: PrerequisiteNotMetException - Complete " + prerequisites.get(course) + " before enrolling in " + course + ".");
            }
            
            if (courseEnrollments.getOrDefault(course, 0) >= COURSE_CAPACITY) {
                throw new Exception("Error: CourseFullException - " + course + " is full.");
            }
            
            courseEnrollments.put(course, courseEnrollments.getOrDefault(course, 0) + 1);
            System.out.println("Enrollment successful in " + course);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Current enrollments: " + courseEnrollments);
        }
        
        sc.close();
    }
}