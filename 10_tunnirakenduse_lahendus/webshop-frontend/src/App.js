import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar';
import Add from './pages/Add';
import Cart from './pages/Cart';
import Home from './pages/Home';
import Manage from './pages/Manage';


function App() {
  return (
<div classname="App">
    <Navbar />
    <Routes>
      <Route path="" element={<Home />} />
      <Route path="lisa" element={<Add />} />
      <Route path="ostukorv" element={<Cart />} />
      <Route path="haldamine" element={<Manage />} />
    </Routes>
</div>
  );
}

export default App;
