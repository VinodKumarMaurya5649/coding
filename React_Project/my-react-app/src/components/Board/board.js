import './board.css';
import Files from './bits/Files.js';
import Ranks from './bits/Ranks.js';
import Pieces from './bits/Pieces/Pieces.js';

const Board = () => {

    const getClassName = (i, j) => {
        let c = 'tile'
        c += (i + j) % 2 === 0 ? ' tile--dark ' : ' tile--light';
        return c
    }

    const ranks = Array(8).fill().map((x, i) => 8 - i)
    const files = Array(8).fill().map((x, i) => i+1)

    return <div className='board'>

        <Ranks ranks={ranks} />
        <div className='tiles'>
            {ranks.map((rank, i) =>
                files.map((file, j) =>
                    <div key={file + '-' + rank} className={getClassName(9-i, j)}></div>
                )
            )}
            <Files files={files} />
        </div>
        <Pieces/>
    </div>
}

export default Board;