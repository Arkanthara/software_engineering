@startuml

class Profile {
	+Name: String
	+Email: String
	+Availabilities: Availabilities
  +modifyInformations()
  +joinGroup()
  +exitGroup()
  +createGroup()
  +sendMessage()
}

class Student extends Profile {
  +Interest: Interest
  +Section: String
  +searchStudent()
  +matchStudent()
  +askToAddHobbies()
}

class Interest {
  -Hobbies: Hobbies
  +getHobbies()
  +addHobbie()
  +deleteHobbie()
}



enum Hobbie {
  +Sport
  +Art
  +Politic
  +Music
  etc...
}
Interest --> Student

class Assistant extends Student {
  +Course: String
 }

class Professor extends Profile {
  +Course: String
}

class Associations extends Profile {
  +Calendar: Calendar
  +makeEvent()
  +deleteEvent()
}

class Group {
  +Admin: Administrators
  +Name: String
  +Description: String
  -Members: Profiles
  +getMembers()
}


class Administrator {
  -Profile: Profile
  +deleteMember()
  +addMember()
}

class Friend {
  -Friends: Student
  +getFriends()
}

Student "*" *-- "*" Friend

Profile "1..*" *-- "*" Group
Administrator "1..*" *-- "1" Group
Hobbie "1..*" *-- "1" Interest

@enduml
