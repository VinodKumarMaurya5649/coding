import './Pieces.css';
import Piece from './Piece.js';
const Pieces = ({ pieces, onPieceClick }) => {
   const position = new Array(8).fill().map(x => new Array(8).fill(''));

   for (let i = 0; i < 8; i++) {
      position[2][i] = 'wp';
      position[6][i] = 'bp';
    
   }


   position[1][0] = 'wr';
   position[1][1] = 'wn';
   position[1][2] = 'wb';
   position[1][3] = 'wq';
   position[1][4] = 'wk';
   position[1][5] = 'wb';
   position[1][6] = 'wn';
   position[1][7] = 'wr';

   position[7][0] = 'br';
   position[7][1] = 'bn';
   position[7][2] = 'bb';
   position[7][3] = 'bq';
   position[7][4] = 'bk';
   position[7][5] = 'bb';
   position[7][6] = 'bn';
   position[7][7] = 'br';

   console.log(position);

   return <div className='pieces'>
    {position.map((r, rank) =>
        r.map((f, file) => 
            position[rank][file] 
            ?<Piece
                key={{rank}+'-'+{file}}
                rank={rank}
                file={file}
                piece={position[rank][file]}/>
            :null 
       ))}
    </div>
}

export default Pieces;