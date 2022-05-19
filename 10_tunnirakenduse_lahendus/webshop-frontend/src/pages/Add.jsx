
function Add(){
    function addProduct(){
        fetch("http://localhost:8080/products", {method:"POST", body: JSON.stringify()});
    }

    return(<div>
        <button onClick={() => addProduct()}></button>
    </div>)
}

export default Add;