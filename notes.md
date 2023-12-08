post /student {name: string, email: string}
get /student/:name
get /student/:email
post /student/hobbie {hobbie: string}
get /student/hobbie/:hobbie
post /student/availabilities {availabilities: string}
get /student/availabilities/:availabilities

get /student/search?hobbie=blabla&...
