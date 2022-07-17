// profile.js
var firstName = 'Michael';
var lastName = 'Jackson';
var year = 1958;

// export object
export { firstName, lastName, year };

// export function
export default function now() {
    return Date().toLocaleString();
}