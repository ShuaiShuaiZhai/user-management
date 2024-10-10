You are to create a REST API for managing users. Your service will be responsible for the following:
• Creating new users
• Listing all available users
• Listing a single user
• Updating an existing user
• Deleting an existing user

Your users should store the following information:
• A username
• A first name
• A last name
• An email
• A phone number

Initialization | Your service will need to perform the following:
• Present a REST API (producing and consuming JSON)
• Persist users through restarts

Exposing an API | Your service should present the following API endpoint:
• POST /users - create a new user
• GET /users - get a list of users
• GET /users/{id}
• PUT /users/{id}
• DELETE /users/{id}
