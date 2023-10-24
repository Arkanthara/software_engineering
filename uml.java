@startuml
skinparam linetype ortho
object Student
object Professor
object Assistant
object Association

object Profile {
	E-mail
	Name
}

Student "*" *-- "1" Profile
Professor "*" *-- "1" Profile
Assistant "*" *-- "1" Profile
Association "*" *-- "1" Profile

@enduml
