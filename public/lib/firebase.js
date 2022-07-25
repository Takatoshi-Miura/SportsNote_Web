// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.9.1/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.9.1/firebase-analytics.js";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyALck2Mz8VOrBOmFnB0Rid4cZrUew9dJjM",
  authDomain: "sportnote-b2c92.firebaseapp.com",
  databaseURL: "https://sportnote-b2c92.firebaseio.com",
  projectId: "sportnote-b2c92",
  storageBucket: "sportnote-b2c92.appspot.com",
  messagingSenderId: "300910913096",
  appId: "1:300910913096:web:f9ee4abee6f5081d905a7d",
  measurementId: "G-V8FP813PWF"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);