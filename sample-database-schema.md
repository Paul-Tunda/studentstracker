# 🎓 StudentTracking – Database Schema

### 1. **Core Entities**

#### `Students`

* `student_id` (PK)
* `first_name`
* `last_name`
* `dob` (date of birth)
* `gender`
* `email`
* `phone`
* `address`
* `country_of_origin`
* `guardian_name`
* `guardian_contact`
* `enrollment_date`
* `status` (active, graduated, dropped, etc.)

#### `Teachers`

* `teacher_id` (PK)
* `first_name`
* `last_name`
* `email`
* `phone`
* `hire_date`
* `department`

#### `Courses`

* `course_id` (PK)
* `course_name`
* `course_code` (e.g., ENG101)
* `description`
* `credits`
* `teacher_id` (FK → Teachers)

#### `Classes`

* `class_id` (PK)
* `course_id` (FK → Courses)
* `semester`
* `year`
* `schedule_time` (e.g., M/W/F 10–11AM)

#### `Enrollments`

* `enrollment_id` (PK)
* `student_id` (FK → Students)
* `class_id` (FK → Classes)
* `enrolled_on`

#### `Grades`

* `grade_id` (PK)
* `enrollment_id` (FK → Enrollments)
* `assignment_name`
* `score`
* `max_score`
* `grade_date`

#### `Attendance`

* `attendance_id` (PK)
* `enrollment_id` (FK → Enrollments)
* `date`
* `status` (present, absent, late, excused)

---

### 2. **Supporting Entities**

#### `Users` (for login/authentication)

* `user_id` (PK)
* `username`
* `password_hash`
* `role` (admin, teacher, student, parent)
* `linked_id` (FK → Students/Teachers depending on role)

#### `Payments`

* `payment_id` (PK)
* `student_id` (FK → Students)
* `amount`
* `payment_date`
* `status` (paid, pending, overdue)
* `reference_number`

---

### 3. **Entity Relationships (simplified ERD in text form)**

```
Students ──< Enrollments >── Classes ──< Courses >── Teachers
   │            │                 │
   │            │                 │
   │          Grades            Attendance
   │
   └──< Payments
```

---

### 4. **Highlights**

* A **student** can enroll in many **classes**.
* A **class** belongs to one **course** and is taught by one **teacher**.
* **Enrollments** connect students ↔ classes.
* **Grades** and **Attendance** are linked to **Enrollments** (not directly to students).
* **Users** table handles login roles (student, teacher, admin, parent).
* **Payments** table tracks tuition/fees.

