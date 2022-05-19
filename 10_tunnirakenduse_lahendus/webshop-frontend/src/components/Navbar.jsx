import { Link } from "react-router-dom";

function Navbar() {
    return(<div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <Link to="">
            <a class="navbar-brand">Navbar</a>
            </Link>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <Link to="">
                    <a class="nav-link">Home <span class="sr-only">(current)</span></a>
                    </Link>
                </li>
                <li class="nav-item">
                    <Link to="lisa">
                    <a class="nav-link">Test</a>
                    </Link>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Dropdown
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item">Lisa toode</a>
                    <a class="dropdown-item">Halda tooteid</a>
                    <a class="dropdown-item">Ostukorv</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled">Disabled</a>
                </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"></input>
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
    </div>);
}

export default Navbar;