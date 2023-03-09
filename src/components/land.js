import React from 'react'
// import Button from '@mui/material/Button';
// import Fab from '@mui/material/Fab';
import AddIcon from '@mui/icons-material/Add';
// import { padding } from '@mui/system';
import { Link } from 'react-router-dom';
import Navbar from './Navbar';
import './navbar.css';
export default function Land() {
  return (
    <div><Navbar/>
    <div className='land'>
   
    <h1>Find out ways to conserve food</h1>
 
    <div className='fridge'>
    <h1 >WHAT'S IN YOUR FRIDGE?</h1>
  
    </div><br/><br></br>
   <br/><br></br>
    <br/><br></br>
    <div className='fridgeicon'>
    <br></br>
    <Link to='/fruits'>
        <AddIcon /> 
      </Link>    FRUITS
      <br></br>
      <br></br>
      <Link to='/vegi'>

        <AddIcon />
    
      </Link>
      VEGITABLES
      <br></br><br></br>
      <Link to='/meat'>

        <AddIcon />
    
      </Link>
      MEAT
      <br></br><br></br>

      <Link to='/diary'>

        <AddIcon />
     
      </Link>
      DAIRY PRODUCTS
    </div>
    </div></div>
  
  )
}
