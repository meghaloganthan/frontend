import './App.css';
import { BrowserRouter, Route, Routes } from "react-router-dom";
// import Header from "./components/header";
import Home from "./components/home";
// import LoginForm from './components/LoginForm';
import Footer from "./components/footer";
import Navbar from './components/Navbar';
import Signup from './components/signup';
import Login from './components/login';
import Land from './components/land';
import Fruits from './components/fruits';
import Vegi from './components/vegi';
import Meat from './components/meat';
import Diary from './components/diary';
import Recipe from './components/recipe';
// import LoginForm from './components/LoginForm';
import Findrecipe from './components/findrecipe';
function App() {
  return (
    <BrowserRouter>
   
    <Routes>
    <Route path="/" element={<Home/>}/>
    <Route path="/home" element={<Home/>}/>
    <Route path="/signup" element={<Signup/>}/>
    <Route path="/login" element={<Login/>}/>
  
    <Route path="/recipe" element={<Recipe/>}/>
    <Route path="/land" element={<Land/>}/>
    <Route path="/fruits" element={<Fruits/>}/>
    <Route path="/vegi" element={<Vegi/>}/>
    <Route path="/meat" element={<Meat/>}/>
    <Route path="/diary" element={<Diary/>}/>
    <Route path="/navbar" element={<Navbar/>}/>
    <Route path="/findrecipe" element={<Findrecipe/>}/>
    </Routes>
    

    </BrowserRouter>
  );
}

export default App;
