export default {
    return {
        'Content-type': 'application/json',
        'Authorization': `Bearer ${localStorage.auth ? JSON.parse(localStorage.auth).access_token : null}` 
    };
}