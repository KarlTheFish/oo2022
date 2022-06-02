import { Route, Routes } from 'react-router-dom';
import './App.css';
import Buttongroup from "./components/Buttongroup";
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from "./pages/Home";
import Add from "./pages/Add";
import {Button} from "react-bootstrap";

function App() {
    return (
        <div className="App">
            <Buttongroup/>
            <Routes>
                <Route path="/home" element={<Home/>}/>
            </Routes>
        </div>
    );
}

export default App;