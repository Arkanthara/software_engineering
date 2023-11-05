@startuml


skinparam linetype ortho

class Profile {
	-Name: String
	-Email: String
	-Availabilities: Availabilities
	+Profile(Name: String, Email: String, Availabilities: Availabilities)
  +getName()
  +getEmail()
  +getAvailabilities()
  +modifyInformations(email: String)
  +modifyInformations(availabilities: Availabilities)
  +modifyInformations(name: String)
  +unregister()
  +joinGroup()
  +exitGroup()
  +createGroup()
  +sendMessage(somebody: Profile, message: String)
  +sendMessage(group: Group, message: String)
}

class Availabilitie {
	- Date: Time
	- Period: Time
	- Description: String
	+Availabilitie(Date: Time, period: Time, description: String)
	+getTime()
	+getPeriod()
}

Availabilitie --> Profile

class Student extends Profile {
  -Interest: Interest
  -Section: String
  +Student(interest: Interest, section: String)
  +getSection()
  +getInterest()
  +searchStudent(interest: Interest)
  +searchStudent(section: String)
  +matchStudent()
  +askToAddHobbies(NameOfHobbies: String)
}

class Interest {
  -Hobbies: Hobbies
  +getHobbies()
  +addHobbie(hobbie: Hobbie)
  +deleteHobbie(hobbie: Hobbie)
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
	  +sendImportantInformation(message: String)
 }

class Professor extends Profile {
  +Course: String
	  +sendImportantInformation(message: String)
}

class Associations extends Profile {
  +Calendar: Calendar
  +makeEvent()
  +deleteEvent()
}

class Group {
  -Admin: Administrators
  -Name: String
  -Description: String
  -Members: Profiles
  +getName()
  +getAdmins()
  +getDescription()
  +getMembers()
}


class Administrator {
  -Profile: Profile
  +deleteMember(member: Profile)
  +addMember(member: Profile)
}

class Friend {
  -Friends: Student
  +getFriends()
}

Student "1" *-- "*" Friend

Profile "1..*" *-- "*" Group
Administrator "1..*" *-- "1" Group
Hobbie "1..*" *-- "1" Interest

@enduml
