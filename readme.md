<h1>Movie Api [ Kotlin, DropWizard]</h1>

<h2>Postman Queries</h2>
1. localhost:8080/provider/${provider} <br /> <br />
2. localhost:8080/id/${id}

<h3>Providers and Provider Id's</h3>
1. CinemaWorld // cw <br /> <br />
2. FilmWorld // fw

<h4>Problem </h4>
External api's return Movie(s) data as seperate API calls we need to provide a combined response so it will be able to display it to our end user. <br />
The secondary issue is that the api's randomly fail for unknown reasons. However we aren't currently solving this secondary problem here.