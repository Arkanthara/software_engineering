@startuml
allow_mixing
// scale 1497*1026

// skinparam linetype ortho

// object Student
// object Professor
// object Assistant
// object Association
interface Profile {
	getName()
	getEmail()
	getAvailabilities()
}

class Student implements Profile {
	-Name: String
	-Email: String
	-Section: String
	-Year: int
	-Interest: Interest
}



// Profile --> Student
// Profile --> Association
// Profile --> Assistant
// Profile --> Professor

// object Group {
// 	Name
// 	Description
// }


// object Interest {
// 	Hobbies
// 	Year
// 	Section
// }

// Interest --> Student

// Student o-- Group
// Assistant o-- Group
// Professor o-- Group
// Association o-- Group

// object Search {
// 	Filters
// }

// object Match {
// 	Students
// }

// Student *-- Search
// Student *-- Match

@enduml
