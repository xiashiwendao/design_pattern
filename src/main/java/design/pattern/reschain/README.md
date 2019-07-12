1. you need to know the different wiht State pattern
	every state know the downstream state, but every ont in res-chain don't know downstream, for it point at client; and in state, client don't need to know the state relationship.
	
2. How about the request is multi-request case?