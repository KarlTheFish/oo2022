import {Button, ButtonGroup} from "react-bootstrap";


function Buttongroup(){
    return(
        <ButtonGroup size={"lg"}>
            <Button variant="danger" href="#add">Left</Button>
            <Button variant="warning">Middle</Button>
            <Button variant="success">Right</Button>
        </ButtonGroup>
    )
}

export default Buttongroup;