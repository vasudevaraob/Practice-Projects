import React, { Component } from 'react';
import axios from "axios";
import { Table } from 'reactstrap';
import { Button } from 'reactstrap';

class TableComponent extends Component{

    state = {
        employees:[]
    }
   
    componentDidMount() {
        axios.get('http://localhost:8082/api/v1/employees')
        //   .then((response) => {
        //     this.setState({ 
        //         employees: response.data 
        //     })
        //   });
        .then(res => {
            const employees = res.data;
            this.setState({ employees });
          })
      }
      
    render(){
        let employees = this.state.employees.map((employee) =>{
            return(
                <tr key={employee.id}>
                    <td>{employee.id}</td>
                    <td>{employee.firstName}</td>
                    <td>{employee.lastName}</td>
                    <td>{employee.emailId}</td>
                    <td>
                        <Button color="success" size="sm" className="mr-2">Edit</Button>
                        <Button color="danger" size="sm">Delete</Button>
                    </td>
                </tr>

            )
        })

        return(
            <div>
                <Table>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email Id</th>
                        </tr>
                    </thead>
                    <tbody>
                        {employees}
                    </tbody>
                </Table>
            </div>
        );
    }

}
// const TableComponent = (props) => {
//   return (
//     <Table>
//       <thead>
//         <tr>
//           <th>#</th>
//           <th>First Name</th>
//           <th>Last Name</th>
//           <th>Username</th>
//         </tr>
//       </thead>
//       <tbody>
//         <tr>
//           <th scope="row">1</th>
//           <td>Mark</td>
//           <td>Otto</td>
//           <td>@mdo</td>
//           <td>
//             <Button color="success" size="sm" className="mr-2">Edit</Button>
//             <Button color="danger" size="sm">Delete</Button>
//           </td>
//         </tr>
//       </tbody>
//     </Table>
//   );
// }

export default TableComponent;