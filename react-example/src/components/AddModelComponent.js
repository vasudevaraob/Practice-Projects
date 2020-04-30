import React, { Component } from 'react';
import axios from "axios";
import { Label,Input,FormGroup,Modal,Button,ModalBody,ModalHeader,ModalFooter } from 'reactstrap';
import Axios from 'axios';

class AddModelComponent extends React.Component{

    state = {
        newEmployeeModel: false,
        newEmployeeData: {
            id:'',
            firstName: '',
            lastName: '',
            emailId: '',
        }
    }

    toggleNewEmployeeModel(){

        this.setState({
            newEmployeeModel: ! this.state.newEmployeeModel
        })
       // this.state.newEmployeeModel= true;
    }

    addEmployee(){

        axios.post('http://localhost:8082/api/v1/employees',this.state.newEmployeeData)
        .then((response)=>{
            this.setState({newEmployeeModel: false, newEmployeeData: {
                id:'',
                firstName: '',
                lastName: '',
                emailId: '',
            }});
        })
    }


    render(){

        return(

            <div>
                <Button color="primary" onClick={this.toggleNewEmployeeModel.bind(this)}>Add Employee</Button>
                <Modal isOpen={this.state.newEmployeeModel} toggle={this.toggleNewEmployeeModel.bind(this)}>
                    <ModalHeader toggle={this.toggleNewEmployeeModel.bind(this)}>Add an Employee Details</ModalHeader>
                    <ModalBody>
                        <FormGroup>
                            <Label for="id">Employee ID</Label>
                            <Input type="text" id="id" value={this.state.newEmployeeData.id} onChange={(e)=>
                            {
                                let {newEmployeeData} = this.state

                                newEmployeeData.id = e.target.value
                                this.setState({newEmployeeData});
                            }
                            }/>
                        </FormGroup>
                        <FormGroup>
                            <Label for="firstName">Employee FirstName</Label>
                            <Input type="text" id="firstName" value={this.state.newEmployeeData.firstName} onChange={(e)=>
                            {
                                let {newEmployeeData} = this.state

                                newEmployeeData.firstName = e.target.value
                                this.setState({newEmployeeData});
                            }
                            } />
                        </FormGroup>
                        <FormGroup>
                            <Label for="lastName">Employee LastName</Label>
                            <Input type="text" id="lastName" value={this.state.newEmployeeData.lastName} onChange={(e)=>
                            {
                                let {newEmployeeData} = this.state

                                newEmployeeData.lastName = e.target.value
                                this.setState({newEmployeeData});
                            }
                            } />
                        </FormGroup>
                        <FormGroup>
                            <Label for="emailId">Email ID</Label>
                            <Input type="text" id="emailId" value={this.state.newEmployeeData.emailId} onChange={(e)=>
                            {
                                let {newEmployeeData} = this.state

                                newEmployeeData.emailId = e.target.value
                                this.setState({newEmployeeData});
                            }
                            } />
                        </FormGroup>
                    </ModalBody>
                    <ModalFooter>
                        <Button color="primary" onClick={this.addEmployee.bind(this)}> Save </Button>{' '}
                        <Button color="secondary" onClick={this.toggleNewEmployeeModel.bind(this)}>Cancel</Button>
                    </ModalFooter>
                </Modal>
            </div>
        );
    }

}

export default AddModelComponent;