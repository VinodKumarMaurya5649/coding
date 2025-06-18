import { getCharecter } from '../../../helper'
import './Files.css'
const Files = ({files}) => {
    return <div className= 'files'>
            {files.map(file => <span key={file}>{getCharecter(file)}</span>)}
        </div>
    
}

export default Files