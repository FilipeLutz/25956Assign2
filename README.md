# Movie Booking App <br />

Filipe Lutz Mariano <br />
Student n°: 25956 <br />

# Requirements <br />

1. Movie screen:  <br />

 1.1. Create a Movie class with the structure specified in movie.json <br />
 1.2. Obtain and fill data <br />
 1.2.1. Obtain relevant movie data from Vue and add data credits at the bottom of the app <br />
 1.2.2. Generate a random number between 0 and 15 for each movie and assign to seats_remaining <br />
 1.2.3. Start with an initial default seats_selected value of 0 for all movies <br />
 1.2.4. You shall fill random URLs for images from pixabay or other free image providers to begin with <br />
 1.4. If any seats are selected, show how many seats are selected and hide remaining seats <br />

2. Seat selection feature: <br />

 2.1. Clicking any item (anywhere on the item) on the movie screen should open a new MovieActivity <br />
 2.2. Add plus and minus icons, show seats_selected in the middle <br />
 2.3. On click plus/minus, update both seats_selected and seats_remaining for that movie <br />
 2.4. Add validation, when 0 seats selected minus is disabled, when 0 seats remaining plus is disabled <br />
 2.5. When back is pressed, the selected seats are retained and reflected in the screen. <br />

3. Bonus: <br />

 3.1. Add "filling fast" badge if less than 3 seats remaining <br />
 3.2. Use "Roboto Condensed" font to replicate same style  <br />
 3.3. Use original movie images from myvue.com or your favourite provider (Hint: check get_movie_image_url.gif) <br />
